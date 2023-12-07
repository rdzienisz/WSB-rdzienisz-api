package com.rdzienisz.university.service;

import com.rdzienisz.university.entities.Company;
import com.rdzienisz.university.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(Long companyId) {
        return companyRepository.findById(companyId).orElse(null);
    }

    public void addCompany(Company company) {
        companyRepository.save(company);
    }

    public void updateCompany(Long companyId, Company updatedCompany) {
        Company existingCompany = companyRepository.findById(companyId).orElse(null);
        if (existingCompany != null) {
            existingCompany.setName(updatedCompany.getName());
            existingCompany.setBudget(updatedCompany.getBudget());
            existingCompany.setEmployees(updatedCompany.getEmployees());
            companyRepository.save(existingCompany);
        }
    }

    public void deleteCompany(Long companyId) {
        companyRepository.deleteById(companyId);
    }
}
