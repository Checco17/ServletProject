package Francesco.CRUD;

import java.util.*;

import Francesco.mybatis.*;
import Francesco.Mapper.AutoMapper;
import Francesco.Model.Auto;

public class AutoCRUD {

	private static AutoCRUD instance;

	private AutoCRUD() {

	}

	public static AutoCRUD getInstance() {

		if (instance == null) {
			instance = new AutoCRUD();
			return instance;

		}
		return instance;
	}

	public ArrayList<Auto> select() {
		ArrayList<Auto> auto = null;
		SqlMapFactory.instance().openSession();
		AutoMapper map = SqlMapFactory.instance().getMapper(AutoMapper.class);
		auto = map.select(); 
		SqlMapFactory.instance().closeSession();
		return auto;

	}

	public void insert(Auto model) {
		SqlMapFactory.instance().openSession();
		AutoMapper map = SqlMapFactory.instance().getMapper(AutoMapper.class);
		map.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void delete(String targa) {
		SqlMapFactory.instance().openSession();
		AutoMapper map = SqlMapFactory.instance().getMapper(AutoMapper.class);
		map.delete(targa);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Auto model) {
		SqlMapFactory.instance().openSession();
		AutoMapper map = SqlMapFactory.instance().getMapper(AutoMapper.class);
		map.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

}
