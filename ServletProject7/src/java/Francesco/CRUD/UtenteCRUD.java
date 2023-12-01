package Francesco.CRUD;

import java.util.ArrayList;

import Francesco.Mapper.UtenteMapper;
import Francesco.Model.Utente;
import Francesco.mybatis.SqlMapFactory;

public class UtenteCRUD {
	

	private static UtenteCRUD instance;

	private UtenteCRUD() {

	}

	public static UtenteCRUD getInstance() {

		if (instance == null) {
			instance = new UtenteCRUD();
			return instance;

		}
		return instance;
	}

	public ArrayList<Utente> select() {
		ArrayList<Utente> auto = null;
		SqlMapFactory.instance().openSession();
		UtenteMapper map = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		auto = map.select();
		SqlMapFactory.instance().closeSession();
		return auto;

	}

	public void insert(Utente model) {
		SqlMapFactory.instance().openSession();
		UtenteMapper map = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		map.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void delete(String email) {
		SqlMapFactory.instance().openSession();
		UtenteMapper map = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		map.delete(email);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

	public void update(Utente model) {
		SqlMapFactory.instance().openSession();
		UtenteMapper map = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		map.update(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();

	}

}
