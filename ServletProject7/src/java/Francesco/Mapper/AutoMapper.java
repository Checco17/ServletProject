package Francesco.Mapper;
import java.util.*;
import Francesco.Model.*;
public interface AutoMapper {
	
	ArrayList<Auto> select();
	void insert(Auto model);
	void delete(String targa);
	void update(Auto model);

}
