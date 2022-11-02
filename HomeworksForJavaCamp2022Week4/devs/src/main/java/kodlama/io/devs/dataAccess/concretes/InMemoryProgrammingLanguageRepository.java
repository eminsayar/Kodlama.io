package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concrete.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{
	
	public List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(2, "C"));
		programmingLanguages.add(new ProgrammingLanguage(3, "C++"));
		programmingLanguages.add(new ProgrammingLanguage(4, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(5, "Python"));
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		programmingLanguages.add(programmingLanguage);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		programmingLanguages.remove(id);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		for(ProgrammingLanguage programmingLanguage2 : programmingLanguages) {
			if(programmingLanguage2.getId()==programmingLanguage.getId()) {
				programmingLanguage.setName(programmingLanguage.getName());
			}
		}
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		// TODO Auto-generated method stub
		for(ProgrammingLanguage programmingLanguage2 : programmingLanguages) {
			if (programmingLanguage2.getId()==id) {
				return programmingLanguage2;
			}
		}
		return null;
	}

	@Override
	public ProgrammingLanguage getByName(String name) {
		// TODO Auto-generated method stub
		for(ProgrammingLanguage programmingLanguage2:programmingLanguages) {
			if (programmingLanguage2.getName()==name) {
				return programmingLanguage2;
			}
		}
		
		return null;
	}

}
