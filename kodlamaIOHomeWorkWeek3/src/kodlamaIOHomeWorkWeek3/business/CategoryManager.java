package kodlamaIOHomeWorkWeek3.business;

import kodlamaIOHomeWorkWeek3.dataAccess.CategoryDao;
import kodlamaIOHomeWorkWeek3.dataAccess.CourseDao;
import kodlamaIOHomeWorkWeek3.entities.Category;
import kodlamaIOHomeWorkWeek3.logging.Logger;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private Category[] categories;
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}
	
	public void addCategory(Category category) throws Exception {
		for(Category currentCategory : categories) {
			if(currentCategory != category) {
				if(currentCategory.getCategoryName() == category.getCategoryName()) {
					throw new Exception("Kategori adý ayný olamaz!");
				}
			}
		}
		
		for(Category currentCategory : categories) {
			if(currentCategory != category) {
				if(currentCategory.getId() == category.getId()) {
					throw new Exception("Kategori Id'si ayný olamaz!");
				}
			}
		}
		
		categoryDao.add(category);
		
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		System.out.println();
	}
}
