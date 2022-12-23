package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.exception.NotFoundExcep;
import com.masai.model.Pospecta;
import com.masai.repository.prospectaRepo;

public class ProspectaServiceImpl implements ProspectaService {
	@Autowired
	prospectaRepo pRepo;

	@Override
	public List<Pospecta> getAllTheDetailsOfClass() {
		// TODO Auto-generated method stub
		return pRepo.findAll();
	}

	@Override
	public String saveTheClassModelDetails(Pospecta pospecta) {
		// TODO Auto-generated method stub
		String str="";
		
		if(pospecta != null) {
			pRepo.save(pospecta);
			str+="new prospecta model is saved";
		}else {
			str+=" please enter all the details";
		}
		return str;
			
	}

	@Override
	public Pospecta getTheDetailsSpecifiedByCategory(Pospecta pospecta, String description) throws NotFoundExcep{
		if(pospecta.getDescription() == description) {
			
			return pRepo.findById(pospecta.getClassId()).get();
		}else {
			
			return pospecta;
		}
	}

	@Override
	public Pospecta getTitleAndDescriptionById(Long id)throws NotFoundExcep {
		// TODO Auto-generated method stub
		return pRepo.getById(id);
	}


}
