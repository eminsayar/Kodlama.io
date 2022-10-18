package kodlamaIOHomeWorkWeek3.dataAccess;

import kodlamaIOHomeWorkWeek3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veri tabanýna eklendi");
		
	}

}
