package com.yokai.showdown.yokai;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.EnumSet;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

public class EnumSetAdapterFactory implements TypeAdapterFactory {

        @Override
        @SuppressWarnings({ "unchecked", "rawtypes" })
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                if (!EnumSet.class.isAssignableFrom(typeToken.getRawType())) {
                        return null;
                }

                java.lang.reflect.Type type = typeToken.getType();
                if (!(type instanceof ParameterizedType)) {
                        return null;
                }

                Class<?> elementClass = (Class<?>) ((ParameterizedType) type).getActualTypeArguments()[0];
                TypeAdapter elementAdapter = gson.getAdapter(elementClass);

                return (TypeAdapter<T>) new TypeAdapter<EnumSet>() {
                        @Override
                        public void write(JsonWriter out, EnumSet set) throws IOException {
                                if (set == null) {
                                        out.nullValue();
                                        return;
                                }
                                out.beginArray();
                                for (Object e : set) {
                                        elementAdapter.write(out, e);
                                }
                                out.endArray();
                        }

                        @Override
                        public EnumSet read(JsonReader in) throws IOException {
                                if (in.peek() == JsonToken.NULL) {
                                        in.nextNull();
                                        return null;
                                }
                                EnumSet result = EnumSet.noneOf((Class) elementClass);
                                in.beginArray();
                                while (in.hasNext()) {
                                        Object value = elementAdapter.read(in);
                                        if (value == null) {
                                                throw new JsonParseException(
                                                        "Valor no válido para " + elementClass.getSimpleName()
                                                        + " en " + in.getPath());
                                        }
                                        result.add(value);
                                }
                                in.endArray();
                                return result;
                        }
                };
        }
}