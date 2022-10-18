package kodlamaIOHomeWorkWeek3.dataAccess;

import kodlamaIOHomeWorkWeek3.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veri tabanýna eklendi");
		
	}

}
