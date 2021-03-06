package org.infinispan.loaders.dummy;

import org.infinispan.commons.configuration.BuiltBy;
import org.infinispan.commons.configuration.ConfigurationFor;
import org.infinispan.commons.util.TypedProperties;
import org.infinispan.configuration.cache.AbstractStoreConfiguration;
import org.infinispan.configuration.cache.AsyncStoreConfiguration;
import org.infinispan.configuration.cache.SingletonStoreConfiguration;

@BuiltBy(DummyInMemoryCacheStoreConfigurationBuilder.class)
@ConfigurationFor(DummyInMemoryCacheStore.class)
public class DummyInMemoryCacheStoreConfiguration extends AbstractStoreConfiguration {

   private final boolean debug;
   private final boolean slow;
   private final String storeName;
   private final Object failKey;

   protected DummyInMemoryCacheStoreConfiguration(boolean debug, boolean slow, String storeName, Object failKey,
         boolean purgeOnStartup, boolean purgeSynchronously, int purgerThreads, boolean fetchPersistentState,
         boolean ignoreModifications, TypedProperties properties, AsyncStoreConfiguration async,
         SingletonStoreConfiguration singletonStore) {
      super(purgeOnStartup, purgeSynchronously, purgerThreads, fetchPersistentState, ignoreModifications, properties,
            async, singletonStore);
      this.debug = debug;
      this.slow = slow;
      this.storeName = storeName;
      this.failKey = failKey;
   }

   public boolean debug() {
      return debug;
   }

   public boolean slow() {
      return slow;
   }

   public String storeName() {
      return storeName;
   }

   public Object failKey() {
      return failKey;
   }
}
