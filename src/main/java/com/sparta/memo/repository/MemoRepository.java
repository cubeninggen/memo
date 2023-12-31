package com.sparta.memo.repository;

import com.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemoRepository extends JpaRepository<Memo,Long> {

        List<Memo> findAllByOrderByModifiedAtDesc();
        Optional<Memo> findById(Long id);

        }