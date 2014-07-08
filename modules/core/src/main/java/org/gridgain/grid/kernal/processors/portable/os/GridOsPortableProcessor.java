/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.kernal.processors.portable.os;

import org.gridgain.client.marshaller.optimized.*;
import org.gridgain.grid.*;
import org.gridgain.grid.kernal.*;
import org.gridgain.grid.kernal.processors.*;
import org.gridgain.grid.kernal.processors.portable.*;
import org.gridgain.portable.*;
import org.jetbrains.annotations.*;

/**
 * No-op implementation of {@link GridPortableProcessor}.
 */
public class GridOsPortableProcessor extends GridProcessorAdapter implements GridPortableProcessor {
    /**
     * @param ctx Kernal context.
     */
    public GridOsPortableProcessor(GridKernalContext ctx) {
        super(ctx);
    }

    /** {@inheritDoc} */
    @Override public boolean isPortableEnabled() {
        return false;
    }

    /** {@inheritDoc} */
    @Override public void configureClientConnection(GridClientConnectionConfiguration cfg) {
        if (cfg.getMarshaller() == null)
            cfg.setMarshaller(new GridClientOptimizedMarshaller());
    }

    /** {@inheritDoc} */
    @Override public int typeId(String typeName) {
        return 0;
    }

    /** {@inheritDoc} */
    @Nullable @Override public Object marshalToPortable(@Nullable Object obj) throws GridPortableException {
        return null;
    }
}
