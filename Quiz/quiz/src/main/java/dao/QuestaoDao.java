package dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.QueryException;

import modelos.Questao;

public class QuestaoDao {

	private EntityManager em;
	
	public QuestaoDao(EntityManager em) {
		this.em = em;
	}
	
	public List<Questao> buscarAtivas(){
		try {
			boolean ativa = true;
			String jpql = "SELECT q FROM Questao q WHERE q.ativa = :ativa";			
			return this.em.createQuery(jpql, Questao.class).setParameter("ativa", ativa).getResultList();
		} catch(Exception e) {
			throw new QueryException("Houve um erro inesperado ao buscar as questões no banco de dados!");
		}
	}
}
