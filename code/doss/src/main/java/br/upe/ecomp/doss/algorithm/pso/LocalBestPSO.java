/**
 * Copyright (C) 2010
 * Swarm Intelligence Team (SIT)
 * Department of Computer and Systems
 * University of Pernambuco
 * Brazil
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package br.upe.ecomp.doss.algorithm.pso;

import br.upe.ecomp.doss.algorithm.pso.topology.LocalBestTopology;

/**
 * Implementation of the Global Best PSO algorithm.
 * 
 * @author Rodrigo Castro
 */
public class LocalBestPSO extends PSO {

    /**
     * Creates a new instance of this class.
     */
    public LocalBestPSO() {
        super();
        setTopology(new LocalBestTopology());
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "Local PSO";
    }

    /**
     * {@inheritDoc}
     */
    public String getDescription() {
        return "An implementation of the local best PSO algorithm.";
    }
}
