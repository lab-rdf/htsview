/**
 * Copyright 2016 Antony Holmes
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.columbia.rdf.htsview.chipseq;

import org.jebtk.core.path.Path;

// TODO: Auto-generated Javadoc
/**
 * The Class SortSamplesByCellType.
 */
public class SortSamplesByCellType extends SortSamplesByChipSeqField {
	
	/**
	 * Instantiates a new sort samples by cell type.
	 */
	public SortSamplesByCellType() {
		super(new Path("/ChIP-Seq/Sample/Cell_Type"));
	}
	
	/* (non-Javadoc)
	 * @see edu.columbia.rdf.edb.ui.sort.SampleSorter#getName()
	 */
	@Override
	public final String getName() {
		return "Cell Type";
	}
}
