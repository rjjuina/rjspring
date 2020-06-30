package com.jjuina.rjspring.io;

import java.io.InputStream;

public interface Resource {
    InputStream getInputStream() throws Exception;
}
