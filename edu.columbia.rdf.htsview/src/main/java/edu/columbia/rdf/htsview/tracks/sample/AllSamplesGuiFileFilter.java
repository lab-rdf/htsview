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
package edu.columbia.rdf.htsview.tracks.sample;

import org.jebtk.modern.io.GuiFileExtFilter;

// TODO: Auto-generated Javadoc
/**
 * The class ReadsAllSupportedGuiFileFilter.
 */
public class AllSamplesGuiFileFilter extends GuiFileExtFilter {

	/**
	 * Instantiates a new reads all supported gui file filter.
	 */
	public AllSamplesGuiFileFilter() {
		super("bam", "brt2j", "bvt");
	}

	/* (non-Javadoc)
	 * @see javax.swing.filechooser.FileFilter#getDescription()
	 */
	@Override
	public String getDescription() {
		return "All Sample Files (*.bam;*.brt2j;*.bvtj)";
	}

}
