package com.example.LK_TL.node;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/node")
public class nodeController {

    private final nodeService nodeService;

    @Autowired
    public nodeController(nodeService nodeService) {
        this.nodeService = nodeService;
    }

    @GetMapping
    public List<node> getnodes() {
        return nodeService.getnodes();
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

                )
        );*/
    }

    @PostMapping
    public void registerNewnode(@RequestBody node node){
        nodeService.addNewnode(node);
    }

}


