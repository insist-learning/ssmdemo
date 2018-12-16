package ssmdemo;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.sve.dao.UserDao;
import com.sve.entity.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<User> getAllUser(int begin, int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getUserCount() {
		// TODO Auto-generated method stub
		return 0;
	}
		

}
