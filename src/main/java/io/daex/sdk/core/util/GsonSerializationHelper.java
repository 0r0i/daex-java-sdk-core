package io.daex.sdk.core.util;

import java.lang.reflect.Type;

/**
 * Utility class to help with serialization in models which extend
 * {@link io.daex.sdk.core.service.model.DynamicModel}.
 *
 * @see io.daex.sdk.core.service.model.DynamicModel
 */
public class GsonSerializationHelper {

  private GsonSerializationHelper() {
    // This is a utility class - no instantiation allowed.
  }

  /**
   * Takes a property of an object extending {@link io.daex.sdk.core.service.model.DynamicModel} and
   * serializes it to the desired type. Without this conversion, properties which also happen to
   * extend {@link io.daex.sdk.core.service.model.DynamicModel} throw an exception when
   * trying to cast to their concrete type from the default Gson serialization.
   *
   * @param property property of a DynamicModel
   * @param type the type we wish to convert the property to
   * @param <T> the generic type
   * @return the properly converted object
   */
  public static <T> T serializeDynamicModelProperty(Object property, Type type) {
    return GsonSingleton.getGson().fromJson(GsonSingleton.getGson().toJsonTree(property), type);
  }
}
