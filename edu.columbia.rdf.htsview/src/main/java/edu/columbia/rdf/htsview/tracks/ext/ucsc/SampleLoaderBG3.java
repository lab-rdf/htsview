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
package edu.columbia.rdf.htsview.tracks.ext.ucsc;

import java.io.IOException;
import java.nio.file.Path;

import org.jebtk.core.tree.TreeNode;
import org.jebtk.modern.window.ModernWindow;

import edu.columbia.rdf.htsview.tracks.Track;
import edu.columbia.rdf.htsview.tracks.loaders.SampleLoader;

/**
 * The Class SampleLoaderBedGraph.
 */
public class SampleLoaderBG3 extends SampleLoader {
  /*
   * (non-Javadoc)
   * 
   * @see
   * edu.columbia.rdf.htsview.tracks.loaders.SampleLoader#openSample(org.abh.
   * common.ui.window.ModernWindow, java.nio.file.Path,
   * org.abh.common.tree.TreeNode)
   */
  @Override
  public Track openSample(ModernWindow parent, Path file, TreeNode<Track> root)
      throws IOException {
    return load(new BG3PlotTrack(BG3.parseBG3(file)), root);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.abh.common.NameProperty#getName()
   */
  @Override
  public String getName() {
    return "BG3";
  }
}
