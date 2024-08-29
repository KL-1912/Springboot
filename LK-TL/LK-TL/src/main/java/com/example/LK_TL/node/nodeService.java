package com.example.LK_TL.node;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class nodeService {

    private final nodeRepository nodeRepository;

    @Autowired
    public nodeService(com.example.LK_TL.node.nodeRepository nodeRepository) {
        this.nodeRepository = nodeRepository;
    }

    public List<node> getnodes() {
        return nodeRepository.findAll();
        /*return List.of(
                new node(
                        "T300_001",
                        "Node1",
                        "sample text",
                        "sample text",
                        "Transponder",
                        "SubgroupNE_1",
                        "sample text",
                        "sample text"

                )*/
        /*);*/
    }

    public void addNewnode(node node) {
        Optional<node> nodeOptional = nodeRepository
                .findnodeBynodeId(node.getNodeId());
        if (nodeOptional.isPresent()) {
            throw new IllegalStateException("Node already exists");
        }
        nodeRepository.save(node);
        /*System.out.println(node);*/

    }
}


