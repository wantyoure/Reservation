package com.example.reservation.service;

import com.example.reservation.entity.docterDto.*;
import com.example.reservation.entity.memberDto.MemberUpdate;
import com.example.reservation.repository.DocterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocterService {

    private final DocterRepository docterRepository;

    public void login(DocterLoginDto docterLoginDto) {
        docterRepository.login(docterLoginDto);
    }

    public void save(DocterDto docterDto) {
        docterRepository.save(docterDto);
    }

    public DocterFindIdDto findId(DocterFindIdDto docterFindIdDto) {
      return docterRepository.findId(docterFindIdDto);
    }

    public void docterUpdate(DocterUpdateDto docterUpdateDto) {
        docterRepository.docterUpdate(docterUpdateDto);
    }

    public void docterDelete(DocterDeleteDto docterDeleteDto) {
        docterRepository.docterDelete(docterDeleteDto);

    }
}
