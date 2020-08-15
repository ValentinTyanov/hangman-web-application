package com.hangman.repositories;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public interface Specification<T> {
  Predicate toPredicate(Root<T> root, CriteriaQuery<T> query, CriteriaBuilder cb);
}
