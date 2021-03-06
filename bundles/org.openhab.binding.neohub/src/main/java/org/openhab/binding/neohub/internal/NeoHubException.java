/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.neohub.internal;

/**
 * The {@link NeoHubException} is a custom exception for NeoHub
 *
 * @author Andrew Fiddian-Green - Initial contribution
 * 
 */
public class NeoHubException extends RuntimeException {

    private static final long serialVersionUID = -7358712540781217363L;

    public NeoHubException(String message) {
        super(message);
    }
}
