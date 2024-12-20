package com.example.t1projectspringbootstarter.config;

import com.example.t1projectspringbootstarter.entity.DataSourceErrorLog;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class StarterEntityRegistrar implements ImportBeanDefinitionRegistrar {

   @Override
   public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
      AutoConfigurationPackages.register(registry, DataSourceErrorLog.class.getPackageName());
   }
}