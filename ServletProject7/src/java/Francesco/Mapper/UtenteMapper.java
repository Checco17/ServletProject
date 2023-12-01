package Francesco.Mapper;

import java.util.ArrayList;

import Francesco.Model.Utente;

public interface UtenteMapper {
	

	ArrayList<Utente> select();
	void insert(Utente model);
	void delete(String email);
	void update(Utente model);

}
