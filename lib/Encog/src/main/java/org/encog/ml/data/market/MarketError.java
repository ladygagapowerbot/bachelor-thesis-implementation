/*
 * Encog(tm) Core v3.2 - Java Version
 * http://www.heatonresearch.com/encog/
 * https://github.com/encog/encog-java-core

 * Copyright 2008-2013 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For more information on Heaton Research copyrights, licenses
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.ml.data.market;

import org.encog.ml.data.temporal.TemporalError;

/**
 * Thrown when an error occurs processing market data.
 * <p/>
 * @author jheaton
 */
public class MarketError extends TemporalError {

    /**
     * The serial id for this class.
     */
    private static final long serialVersionUID = 9199552396430520659L;

    /**
     * Construct a message exception.
     * <p/>
     * @param msg
     *            The exception message.
     */
    public MarketError(final String msg) {
        super(msg);
    }

    /**
     * Construct an exception that holds another exception.
     * <p/>
     * @param t
     *          The other exception.
     */
    public MarketError(final Throwable t) {
        super(t);
    }
}
