/* 
 Copyright (C) GridGain Systems. All Rights Reserved.
 
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.loadtests.mapper;

import org.gridgain.grid.*;
import org.gridgain.grid.util.typedef.*;

import javax.swing.*;

/**
 * Starts up an empty node with cache configuration.
 * You can also start a stand-alone GridGain instance by passing the path
 * to configuration file to {@code 'ggstart.{sh|bat}'} script, like so:
 * {@code 'ggstart.sh examples/config/example-cache.xml'}.
 * <p>
 * The difference is that running this class from IDE adds all example classes to classpath
 * but running from command line doesn't.
 */
public class GridNodeStartup {
    /**
     * Start up an empty node with specified cache configuration.
     *
     * @param args Command line arguments, none required.
     * @throws GridException If example execution failed.
     */
    public static void main(String[] args) throws GridException {
        try (Grid ignored = G.start("examples/config/example-cache.xml")) {
            // Wait until Ok is pressed.
            JOptionPane.showMessageDialog(
                null,
                new JComponent[] {
                    new JLabel("GridGain started."),
                    new JLabel("Press OK to stop GridGain.")
                },
                "GridGain",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
