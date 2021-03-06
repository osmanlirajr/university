package org.jboss.seam.university.producer;

import javax.enterprise.context.ConversationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.jboss.seam.solder.core.ExtensionManaged;

/**
 * 
 * @author Shane Bryzak
 *
 */
public class EntityManagerProducer
{
   @Produces
   @ExtensionManaged
   @ConversationScoped
   @PersistenceUnit
   EntityManagerFactory emf;
}
