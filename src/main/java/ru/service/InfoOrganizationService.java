package ru.service;

import java.util.List;

import ru.domain.InfoOrganization;

public interface InfoOrganizationService {
	public InfoOrganization findOne(Long infoId);
	public List<InfoOrganization> findAll();
}
