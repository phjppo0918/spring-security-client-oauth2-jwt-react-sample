package com.example.springapp.domain.member.service;

import com.example.springapp.domain.member.entity.Member;
import com.example.springapp.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

  private final MemberRepository memberRepository;

  @Transactional
  public void save(Member member) {
    memberRepository.save(member);
  }
}
