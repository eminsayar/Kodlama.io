package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.dataAccess.concretes.InMemoryProgrammingLanguageRepository;
import kodlama.io.devs.entities.concrete.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	
	private ProgrammingLanguageRepository programmingLanguageRepository;
	private InMemoryProgrammingLanguageRepository inMemoryProgrammingLanguageRepository;
	private List<ProgrammingLanguage> programmingLanguages;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository,
			InMemoryProgrammingLanguageRepository inMemoryProgrammingLanguageRepository,
			List<ProgrammingLanguage> programmingLanguages) {
		super();
		this.programmingLanguageRepository = programmingLanguageRepository;
		this.inMemoryProgrammingLanguageRepository = inMemoryProgrammingLanguageRepository;
		this.programmingLanguages = programmingLanguages;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		for(ProgrammingLanguage programmingLanguages : inMemoryProgrammingLanguageRepository.programmingLanguages) {
			if (programmingLanguages.getName().equals(programmingLanguage.getName())) {
				System.out.println("İsim tekrar edemez.");
			}if(programmingLanguages.getName().isEmpty()) {
				System.out.println("İsim boş geçilemez");
			}
			else {
				programmingLanguageRepository.add(programmingLanguage);				
			}
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		programmingLanguageRepository.delete(id);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		programmingLanguageRepository.update(programmingLanguage);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		// TODO Auto-generated method stub
		return programmingLanguageRepository.getById(id);
	}

	@Override
	public ProgrammingLanguage getByName(String name) {
		// TODO Auto-generated method stub
		return programmingLanguageRepository.getByName(name);
	}

}
