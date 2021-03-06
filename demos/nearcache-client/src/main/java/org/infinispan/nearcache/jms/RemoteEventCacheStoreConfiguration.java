package org.infinispan.nearcache.jms;

import org.infinispan.commons.configuration.BuiltBy;
import org.infinispan.commons.configuration.ConfigurationFor;
import org.infinispan.commons.util.TypedProperties;
import org.infinispan.configuration.cache.AbstractStoreConfiguration;
import org.infinispan.configuration.cache.AsyncStoreConfiguration;
import org.infinispan.configuration.cache.SingletonStoreConfiguration;


@BuiltBy(RemoteEventCacheStoreConfigurationBuilder.class)
@ConfigurationFor(RemoteEventCacheStore.class)
public class RemoteEventCacheStoreConfiguration extends AbstractStoreConfiguration {

   protected RemoteEventCacheStoreConfiguration(boolean purgeOnStartup, boolean purgeSynchronously, int purgerThreads, boolean fetchPersistentState, boolean ignoreModifications,
         TypedProperties properties, AsyncStoreConfiguration async, SingletonStoreConfiguration singletonStore) {
      super(purgeOnStartup, purgeSynchronously, purgerThreads, fetchPersistentState, ignoreModifications, properties, async, singletonStore);
   }
}
