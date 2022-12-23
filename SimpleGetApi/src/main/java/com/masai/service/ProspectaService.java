package com.masai.service;

import java.util.List;
import com.masai.exception.NotFoundExcep;
import com.masai.model.Pospecta;

public interface ProspectaService {
public List<Pospecta> getAllTheDetailsOfClass();
	
	public String saveTheClassModelDetails(Pospecta Pospecta);
	
	public Pospecta getTheDetailsSpecifiedByCategory(Pospecta Pospecta, String description)throws NotFoundExcep;
	
	public Pospecta getTitleAndDescriptionById(Long id)throws NotFoundExcep;

}
