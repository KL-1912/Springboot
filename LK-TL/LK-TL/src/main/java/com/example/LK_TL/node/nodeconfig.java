package com.example.LK_TL.node;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class nodeconfig {

    @Bean
    CommandLineRunner commandLineRunner(nodeRepository repository) {
        return args -> {
             node T300_001 = new node(
                    "T300_001",
                    "Node1",
                    "sample text",
                    "sample text",
                    "Transponder",
                    "SubgroupNE_1",
                    "sample text",
                    "sample text"

            );
            node T300_002 = new node(
                    "T300_002",
                    "Node2",
                    "sample text",
                    "sample text",
                    "Transponder",
                    "SubgroupNE_1",
                    "sample text",
                    "sample text"

            );
            node T300_003 = new node(
                    "T300_003",
                    "Node3",
                    "sample text",
                    "sample text",
                    "Transponder",
                    "SubgroupNE_1",
                    "sample text",
                    "sample text"

            );
            node T300_004 = new node(
                    "T300_004",
                    "Node4",
                    "sample text",
                    "sample text",
                    "Transponder",
                    "SubgroupNE_1",
                    "sample text",
                    "sample text"

            );
            node T300_005 = new node(
                    "T300_005",
                    "Node5",
                    "sample text",
                    "sample text",
                    "Transponder",
                    "SubgroupNE_1",
                    "sample text",
                    "sample text"

            );
            node T300_006 = new node(
                    "T300_006",
                    "Node6",
                    "sample text",
                    "sample text",
                    "Transponder",
                    "SubgroupNE_2",
                    "sample text",
                    "sample text"

            );
            node T300_007 = new node(
                    "T300_007",
                    "Node7",
                    "sample text",
                    "sample text",
                    "Roadm",
                    "SubgroupNE_2",
                    "sample text",
                    "sample text"

            );
            node T300_008 = new node(
                    "T300_008",
                    "Node8",
                    "sample text",
                    "sample text",
                    "Roadm",
                    "SubgroupNE_2",
                    "sample text",
                    "sample text"

            );
            node T300_009 = new node(
                    "T300_009",
                    "Node9",
                    "sample text",
                    "sample text",
                    "Roadm",
                    "SubgroupNE_2",
                    "sample text",
                    "sample text"

            );
            node T300_010 = new node(
                    "T300_010",
                    "Node10",
                    "sample text",
                    "sample text",
                    "Roadm",
                    "Group 1",
                    "sample text",
                    "sample text"

            );
            node T300_011 = new node(
                    "T300_011",
                    "Node11",
                    "sample text",
                    "sample text",
                    "Roadm",
                    "Group 1",
                    "sample text",
                    "sample text"

            );
            node T300_012 = new node(
                    "T300_012",
                    "Node12",
                    "sample text",
                    "sample text",
                    "Roadm",
                    "Group 1",
                    "sample text",
                    "sample text"

            );
            node T300_013 = new node(
                    "T300_013",
                    "Node13",
                    "sample text",
                    "sample text",
                    "Roadm",
                    "Group 1",
                    "sample text",
                    "sample text"

            );

            repository.saveAll(
                    List.of(T300_001, T300_002, T300_003, T300_004, T300_005, T300_006,
                            T300_007, T300_008, T300_009, T300_010, T300_011, T300_012, T300_013)
            );

        };
    }
}
