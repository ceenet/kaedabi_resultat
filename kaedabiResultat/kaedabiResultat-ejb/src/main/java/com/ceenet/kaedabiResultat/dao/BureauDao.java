/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceenet.kaedabiResultat.dao;

import com.ceenet.kaedabiResultat.model.Bureau;
import com.ceenet.kaedabiResultat.model.Hierachie;
import java.util.List;


/**
 *
 * @author manukey
 */
public interface BureauDao extends GenericDao<Bureau>{
    public List<Bureau> findbyHierachie(Hierachie hierachie);
    
}
