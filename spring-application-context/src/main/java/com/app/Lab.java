package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.app.Beans.ElectricEngine;
import com.app.Beans.GasEngine;
import com.app.Beans.NuclearEngine;

@Component
public class Lab {
    /**
     * Notice that the ApplicationContext is itself a bean that can be retrieved from the Spring IOC container
     * (in a sense, from itself, since this is now a Bean used to retrieve Beans)
     */
    @Autowired
    ApplicationContext applicationContext;

    /**
     * Retrieves the ElectricPoweredBean from the ApplicationContext by requesting a bean of the class ElectricEngine.
     * @return an ElectricEngine bean
     */
    public ElectricEngine getElectricPoweredBean(){
        return applicationContext.getBean(ElectricEngine.class);
    }

    /**
     * Retrieves the GasPoweredBean from the ApplicationContext by requesting a bean of the class GasEngine.
     * 
     * @return a GasEngine bean
     */
    public GasEngine getGasPoweredBean(){
        return applicationContext.getBean(GasEngine.class);
    }

    /**
     * Retrieves the NuclearPoweredBean from the ApplicationContext by requesting a bean of the class NuclearEngine.
     * 
     * @return a NuclearEngine bean
     */
    public NuclearEngine getNuclearPoweredBean(){
        return applicationContext.getBean(NuclearEngine.class);
    }
}