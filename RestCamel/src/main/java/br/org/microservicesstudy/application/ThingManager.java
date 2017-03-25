/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.microservicesstudy.application;

import br.org.microservicesstudy.domain.thing.model.Thing;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author robson
 */
@Service
public class ThingManager {
    
    public List<Thing> findAll() {
        return Arrays.asList(Thing.builder().name("thing 1").build());
    }
    
}
