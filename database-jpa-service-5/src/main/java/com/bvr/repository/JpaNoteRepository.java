package com.bvr.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bvr.domain.Note;
import com.bvr.domain.Tag;

@Repository
public class JpaNoteRepository implements NoteRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Note> findAll() {
		// TODO Auto-generated method stub
		return this.entityManager.createQuery("SELECT n FROM Note n", Note.class).getResultList();
	}
}
