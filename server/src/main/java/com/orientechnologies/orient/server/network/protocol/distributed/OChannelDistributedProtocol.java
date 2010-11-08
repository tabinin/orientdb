/*
 * Copyright 1999-2010 Luca Garulli (l.garulli--at--orientechnologies.com)
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
 */
package com.orientechnologies.orient.server.network.protocol.distributed;

import com.orientechnologies.orient.enterprise.channel.binary.OChannelBinaryProtocol;

/**
 * Cluster extension to the default binary protocol. The range of requests is 80-90.
 * 
 * @author Luca Garulli (l.garulli--at--orientechnologies.com)
 * 
 */
public class OChannelDistributedProtocol extends OChannelBinaryProtocol {
	public static final byte	NODECLUSTER_KEEPALIVE		= 80;
	public static final byte	NODECLUSTER_CONNECT			= 81;
	public static final byte	NODECLUSTER_DISCONNECT	= 82;
}
