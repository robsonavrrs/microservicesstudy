/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.microservicesstudy.domain.thing.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

/**
 *
 * @author robson
 */
@Data
@Builder
@AllArgsConstructor
public class Thing implements Serializable{
    
    @NonNull private String name;
    
}
