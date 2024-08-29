package com.example.LK_TL.node;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface nodeRepository
        extends JpaRepository<node, String> {

    @Query("SELECT n from node n where n.nodeId = ?1")

    Optional<node> findnodeBynodeId(String nodeId);
}
