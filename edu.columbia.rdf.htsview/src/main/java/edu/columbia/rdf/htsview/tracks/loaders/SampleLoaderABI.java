/**
 * Copyright 2017 Antony Holmes
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
package edu.columbia.rdf.htsview.tracks.loaders;

import java.io.IOException;
import java.nio.file.Path;

import org.jebtk.core.tree.TreeNode;
import org.jebtk.modern.window.ModernWindow;

import edu.columbia.rdf.htsview.ext.abi.ABITrace;
import edu.columbia.rdf.htsview.tracks.Track;
import edu.columbia.rdf.htsview.tracks.abi.ABIPlotTrack;

// TODO: Auto-generated Javadoc
/**
 * The Class SampleLoaderABI.
 */
public class SampleLoaderABI extends SampleLoaderFS {
	
	/* (non-Javadoc)
	 * @see org.abh.common.NameProperty#getName()
	 */
	@Override
	public String getName() {
		return "AB1";
	}

	/* (non-Javadoc)
	 * @see edu.columbia.rdf.htsview.tracks.loaders.SampleLoader#getExt()
	 */
	@Override
	public String getExt() {
		return "ab1";
	}
	
	/* (non-Javadoc)
	 * @see edu.columbia.rdf.htsview.tracks.loaders.SampleLoader#openSample(org.abh.common.ui.window.ModernWindow, java.nio.file.Path, org.abh.common.tree.TreeNode)
	 */
	@Override
	public Track openSample(ModernWindow parent,
			Path file, 
			TreeNode<Track> root) throws IOException {
		
		ABITrace trace = ABITrace.parse(file);
		
		Track ret = load(new ABIPlotTrack(trace), root);
		
		return ret;
	}
}
