package org.myGroup.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring configuration to autoscan all aura packages
 */
@Configuration
@ComponentScan(basePackages = {"org.myGroup"}, lazyInit = true)
public class CustomConfiguration {
}