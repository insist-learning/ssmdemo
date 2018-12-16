package com.sve.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sve.entity.User;
import com.sve.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	// 查询所有并分页
	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	public String getAllUser(ModelMap model,
			@RequestParam(value = "page_current", required = false, defaultValue = "1") int page_current, Integer begin,
			Integer num) {
		num = 6;// 每页存放的记录数
		int count = userService.getUserCount();// 总记录数
		int pageCount = count % num == 0 ? count / num : count / num + 1;// 总页数
		begin = (page_current - 1) * num;
		model.put("count", count);
		model.put("pageCount", pageCount);
		model.put("page_current", page_current);
		model.put("user", userService.getAllUser(begin, num));
		return "user/index";
	}

	// 查看用户详情
	@RequestMapping(value = "/look/{id}", method = RequestMethod.GET)
	public String look(@PathVariable(value = "id") int id, ModelMap model) {
		User user = userService.getById(id);
		model.put("user", user);
		return "user/userDetails";
	}

	// 修改用户
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String update(@PathVariable("id") int id, ModelMap model) {
		User user = userService.getById(id);
		model.put("user", user);
		return "user/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("user") @Validated User user, BindingResult bindingResult, ModelMap model) {
		if (bindingResult.hasErrors()) {
			return "user/update";
		}
		int i = userService.updateUser(user);
		if (i > 0) {
			model.put("message", "修改成功！");
		} else {
			model.put("message", "修改失败！");
		}
		return "success";
	}
	
	// 添加用户
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add() {
		return new ModelAndView("user/add","user",new User());
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(@ModelAttribute("user") @Validated User user, BindingResult bindingResult, ModelMap model) {
		if (bindingResult.hasErrors()) {
			return "user/add";
		}
		int i = userService.addUser(user);
		if (i > 0) {
			model.put("message", "添加成功！");
		} else {
			model.put("message", "添加失败！");
		}
		return "success";
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String deleteUser(@PathVariable int id,ModelMap model) {
		int i = userService.deleteUser(id);
		if (i > 0) {
			model.put("message", "删除成功！");
		} else {
			model.put("message", "删除失败！");
		}
		return "success";
	}
}
