/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.microservicesstudy.infrastructure.route;

import br.org.microservicesstudy.domain.thing.model.Thing;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author robson
 */
@Component
public class RestRoute extends RouteBuilder{

    @Override
    public void configure() throws Exception {
         restConfiguration().component( "undertow" ).port( 8081 ).bindingMode(RestBindingMode.json); 
         
          rest("/things")
            .get()
                .outTypeList(Thing.class)
                .to("bean:thingManager?method=findAll");

    }
    
}
