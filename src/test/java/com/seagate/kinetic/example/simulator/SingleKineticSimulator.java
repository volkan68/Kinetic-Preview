/**
 * Copyright (c) 2013 Seagate Technology LLC
 * All rights reserved.

 * Redistribution and use in source and binary forms, with or without modification, are permitted
 * provided that the following conditions are met:

 * 1) Redistributions of source code must retain the above copyright notice, this list of conditions
 * and the following disclaimer.

 * 2) Redistributions in binary form must reproduce the above copyright notice, this list of
 * conditions and the following disclaimer in the documentation and/or other materials provided
 * with the distribution.

 * 3) Neither the name of Seagate Technology nor the names of its contributors may be used to
 * endorse or promote products derived from this software without specific prior written permission
 * from Seagate Technology.

 * 4) No patent or trade secret license whatsoever, either express or implied, is granted by Seagate
 * Technology or its contributors by this copyright license.

 * 5) All modifications must be reposted in source code form in a manner that allows user to
 * readily access the source code.

 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
 * CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, NONINFRINGEMENT AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.  THE COPYRIGHT
 * HOLDERS AND CONTRIBUTORS DISCLAIM ALL LIABILITY FOR
 * INTELLECTUAL PROPERTY INFRINGEMENT RELATED TO THIS SOFTWARE.
 */
package com.seagate.kinetic.example.simulator;

import com.seagate.kinetic.simulator.KineticSimulator;
import com.seagate.kinetic.simulator.SimulatorConfiguration;

/**
 * 
 * Start a simulator instance example.
 * <p>
 * This example starts one instance of Kinetic Simulator with default
 * configurations.
 * <p>
 * The started Simulator service listens on port 8123 for (TCP) and 8443 for
 * (SSL/TLS).
 * 
 */
public class SingleKineticSimulator {

	public static void main(String[] args) {
		SimulatorConfiguration config = new SimulatorConfiguration();
		KineticSimulator simulator = new KineticSimulator(config);

		System.out.println("Example simulator started on port="
				+ simulator.getServerConfiguration().getPort()
				+ ", SSL/TLS port="
				+ simulator.getServerConfiguration().getSslPort());
	}


}
