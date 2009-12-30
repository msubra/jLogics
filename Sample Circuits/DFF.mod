<module>
  <cir>
    <components>
      <nand>
        <MAX__INPUTS>16</MAX__INPUTS>
        <MAX__OUTPUTS>1</MAX__OUTPUTS>
        <MIN__INPUTS>2</MIN__INPUTS>
        <MIN__OUTPUTS>1</MIN__OUTPUTS>
        <label>1</label>
        <fnt>
          <attributes>
            <entry>
              <java.awt.font.TextAttribute>
                <name>width</name>
              </java.awt.font.TextAttribute>
              <float>1.0</float>
            </entry>
            <entry>
              <java.awt.font.TextAttribute>
                <name>superscript</name>
              </java.awt.font.TextAttribute>
              <int>0</int>
            </entry>
            <entry>
              <java.awt.font.TextAttribute>
                <name>posture</name>
              </java.awt.font.TextAttribute>
              <float>0.0</float>
            </entry>
            <entry>
              <java.awt.font.TextAttribute>
                <name>family</name>
              </java.awt.font.TextAttribute>
              <string>Courier</string>
            </entry>
            <entry>
              <java.awt.font.TextAttribute>
                <name>size</name>
              </java.awt.font.TextAttribute>
              <float>10.0</float>
            </entry>
            <entry>
              <java.awt.font.TextAttribute>
                <name>weight</name>
              </java.awt.font.TextAttribute>
              <float>1.0</float>
            </entry>
            <entry>
              <java.awt.font.TextAttribute>
                <name>transform</name>
              </java.awt.font.TextAttribute>
              <java.awt.font.TransformAttribute/>
            </entry>
          </attributes>
        </fnt>
        <name>NAND</name>
        <id>3</id>
        <inputs>
          <node.InputNode>
            <id>0</id>
            <connected>true</connected>
            <from class="node.OutputNode">
              <id>0</id>
              <connected>false</connected>
              <parent class="nand">
                <MAX__INPUTS>16</MAX__INPUTS>
                <MAX__OUTPUTS>1</MAX__OUTPUTS>
                <MIN__INPUTS>2</MIN__INPUTS>
                <MIN__OUTPUTS>1</MIN__OUTPUTS>
                <label>2</label>
                <fnt reference="../../../../../fnt"/>
                <name>NAND</name>
                <id>3</id>
                <inputs>
                  <node.InputNode>
                    <id>0</id>
                    <connected>true</connected>
                    <from class="node.OutputNode">
                      <id>0</id>
                      <connected>false</connected>
                      <parent class="nand">
                        <MAX__INPUTS>16</MAX__INPUTS>
                        <MAX__OUTPUTS>1</MAX__OUTPUTS>
                        <MIN__INPUTS>2</MIN__INPUTS>
                        <MIN__OUTPUTS>1</MIN__OUTPUTS>
                        <label>4</label>
                        <fnt reference="../../../../../../../../../fnt"/>
                        <name>NAND</name>
                        <id>3</id>
                        <inputs>
                          <node.InputNode>
                            <id>0</id>
                            <connected>true</connected>
                            <from class="node.OutputNode">
                              <id>0</id>
                              <connected>false</connected>
                              <parent class="gates.ByPassGate">
                                <MAX__INPUTS>1</MAX__INPUTS>
                                <MAX__OUTPUTS>1</MAX__OUTPUTS>
                                <MIN__INPUTS>1</MIN__INPUTS>
                                <MIN__OUTPUTS>1</MIN__OUTPUTS>
                                <fnt>
                                  <attributes>
                                    <entry>
                                      <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../fnt/attributes/entry/java.awt.font.TextAttribute"/>
                                      <float>1.0</float>
                                    </entry>
                                    <entry>
                                      <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../fnt/attributes/entry[3]/java.awt.font.TextAttribute"/>
                                      <float>0.0</float>
                                    </entry>
                                    <entry>
                                      <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../fnt/attributes/entry[2]/java.awt.font.TextAttribute"/>
                                      <int>0</int>
                                    </entry>
                                    <entry>
                                      <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../fnt/attributes/entry[4]/java.awt.font.TextAttribute"/>
                                      <string>Courier</string>
                                    </entry>
                                    <entry>
                                      <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../fnt/attributes/entry[5]/java.awt.font.TextAttribute"/>
                                      <float>10.0</float>
                                    </entry>
                                    <entry>
                                      <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../fnt/attributes/entry[6]/java.awt.font.TextAttribute"/>
                                      <float>1.0</float>
                                    </entry>
                                    <entry>
                                      <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../fnt/attributes/entry[7]/java.awt.font.TextAttribute"/>
                                      <java.awt.font.TransformAttribute/>
                                    </entry>
                                  </attributes>
                                </fnt>
                                <name>BYPASS</name>
                                <id>12</id>
                                <inputs>
                                  <node.InputNode>
                                    <id>0</id>
                                    <connected>false</connected>
                                    <parent class="module" reference="../../../../../../../../../../../../../../../../../.."/>
                                    <connections/>
                                    <label>D</label>
                                    <border>
                                      <red>0</red>
                                      <green>0</green>
                                      <blue>255</blue>
                                      <alpha>255</alpha>
                                    </border>
                                    <signal>
                                      <signal>false</signal>
                                    </signal>
                                    <x>-10</x>
                                    <y>0</y>
                                    <width>5</width>
                                    <height>5</height>
                                  </node.InputNode>
                                </inputs>
                                <outputs>
                                  <node.OutputNode reference="../../.."/>
                                </outputs>
                                <inputCount>1</inputCount>
                                <outputCount>1</outputCount>
                                <canMove>false</canMove>
                                <x1>0</x1>
                                <y1>0</y1>
                                <x2>0</x2>
                                <y2>0</y2>
                                <border reference="../inputs/node.InputNode/border"/>
                                <signal>
                                  <signal>false</signal>
                                </signal>
                                <circuit reference="../../../../../../../../../../../../../../.."/>
                                <x>0</x>
                                <y>0</y>
                                <width>20</width>
                                <height>20</height>
                              </parent>
                              <connections>
                                <node.InputNode reference="../../.."/>
                                <node.InputNode>
                                  <id>0</id>
                                  <connected>true</connected>
                                  <from class="node.OutputNode" reference="../../.."/>
                                  <parent class="nand">
                                    <MAX__INPUTS>16</MAX__INPUTS>
                                    <MAX__OUTPUTS>1</MAX__OUTPUTS>
                                    <MIN__INPUTS>2</MIN__INPUTS>
                                    <MIN__OUTPUTS>1</MIN__OUTPUTS>
                                    <label>5</label>
                                    <fnt reference="../../../../../../../../../../../../../../../fnt"/>
                                    <name>NAND</name>
                                    <id>3</id>
                                    <inputs>
                                      <node.InputNode reference="../../.."/>
                                      <node.InputNode>
                                        <id>1</id>
                                        <connected>true</connected>
                                        <from class="node.OutputNode" reference="../../../../../.."/>
                                        <parent class="nand" reference="../../.."/>
                                        <connections/>
                                        <border>
                                          <red>0</red>
                                          <green>0</green>
                                          <blue>255</blue>
                                          <alpha>255</alpha>
                                        </border>
                                        <signal reference="../../../../../../parent/signal"/>
                                        <x>109</x>
                                        <y>142</y>
                                        <width>5</width>
                                        <height>5</height>
                                      </node.InputNode>
                                    </inputs>
                                    <outputs>
                                      <node.OutputNode>
                                        <id>0</id>
                                        <connected>false</connected>
                                        <parent class="nand" reference="../../.."/>
                                        <connections>
                                          <node.InputNode>
                                            <id>1</id>
                                            <connected>true</connected>
                                            <from class="node.OutputNode" reference="../../.."/>
                                            <parent class="nand">
                                              <MAX__INPUTS>16</MAX__INPUTS>
                                              <MAX__OUTPUTS>1</MAX__OUTPUTS>
                                              <MIN__INPUTS>2</MIN__INPUTS>
                                              <MIN__OUTPUTS>1</MIN__OUTPUTS>
                                              <label>3</label>
                                              <fnt reference="../../../../../../../../../../../../../../../../../../../../fnt"/>
                                              <name>NAND</name>
                                              <id>3</id>
                                              <inputs>
                                                <node.InputNode>
                                                  <id>0</id>
                                                  <connected>true</connected>
                                                  <from class="node.OutputNode">
                                                    <id>0</id>
                                                    <connected>false</connected>
                                                    <parent class="gates.ByPassGate">
                                                      <MAX__INPUTS>1</MAX__INPUTS>
                                                      <MAX__OUTPUTS>1</MAX__OUTPUTS>
                                                      <MIN__INPUTS>1</MIN__INPUTS>
                                                      <MIN__OUTPUTS>1</MIN__OUTPUTS>
                                                      <fnt>
                                                        <attributes>
                                                          <entry>
                                                            <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../../../../../../../../../../../../fnt/attributes/entry/java.awt.font.TextAttribute"/>
                                                            <float>1.0</float>
                                                          </entry>
                                                          <entry>
                                                            <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../../../../../../../../../../../../fnt/attributes/entry[3]/java.awt.font.TextAttribute"/>
                                                            <float>0.0</float>
                                                          </entry>
                                                          <entry>
                                                            <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../../../../../../../../../../../../fnt/attributes/entry[2]/java.awt.font.TextAttribute"/>
                                                            <int>0</int>
                                                          </entry>
                                                          <entry>
                                                            <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../../../../../../../../../../../../fnt/attributes/entry[4]/java.awt.font.TextAttribute"/>
                                                            <string>Courier</string>
                                                          </entry>
                                                          <entry>
                                                            <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../../../../../../../../../../../../fnt/attributes/entry[5]/java.awt.font.TextAttribute"/>
                                                            <float>10.0</float>
                                                          </entry>
                                                          <entry>
                                                            <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../../../../../../../../../../../../fnt/attributes/entry[6]/java.awt.font.TextAttribute"/>
                                                            <float>1.0</float>
                                                          </entry>
                                                          <entry>
                                                            <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../../../../../../../../../../../../../../fnt/attributes/entry[7]/java.awt.font.TextAttribute"/>
                                                            <java.awt.font.TransformAttribute reference="../../../../../../../../../../../../../../../../parent/fnt/attributes/entry[7]/java.awt.font.TransformAttribute"/>
                                                          </entry>
                                                        </attributes>
                                                      </fnt>
                                                      <name>BYPASS</name>
                                                      <id>12</id>
                                                      <inputs>
                                                        <node.InputNode>
                                                          <id>1</id>
                                                          <connected>false</connected>
                                                          <parent class="module" reference="../../../../../../../../../../../../../../../../../../../../../../../../../../../../.."/>
                                                          <connections/>
                                                          <label>Clock</label>
                                                          <border reference="../../../../../../../../../../../../../../../parent/inputs/node.InputNode/border"/>
                                                          <signal>
                                                            <signal>false</signal>
                                                          </signal>
                                                          <x>-10</x>
                                                          <y>10</y>
                                                          <width>5</width>
                                                          <height>5</height>
                                                        </node.InputNode>
                                                      </inputs>
                                                      <outputs>
                                                        <node.OutputNode reference="../../.."/>
                                                      </outputs>
                                                      <inputCount>1</inputCount>
                                                      <outputCount>1</outputCount>
                                                      <canMove>false</canMove>
                                                      <x1>0</x1>
                                                      <y1>0</y1>
                                                      <x2>0</x2>
                                                      <y2>0</y2>
                                                      <border reference="../../../../../../../../../../../../../parent/inputs/node.InputNode/border"/>
                                                      <signal>
                                                        <signal>false</signal>
                                                      </signal>
                                                      <circuit reference="../../../../../../../../../../../../../../../../../../../../../../../../../.."/>
                                                      <x>0</x>
                                                      <y>0</y>
                                                      <width>20</width>
                                                      <height>20</height>
                                                    </parent>
                                                    <connections>
                                                      <node.InputNode>
                                                        <id>1</id>
                                                        <connected>true</connected>
                                                        <from class="node.OutputNode" reference="../../.."/>
                                                        <parent class="nand" reference="../../../../../../../../../../../../../../../../.."/>
                                                        <connections/>
                                                        <border reference="../../../../../../../../../../../inputs/node.InputNode[2]/border"/>
                                                        <signal reference="../../../parent/signal"/>
                                                        <x>198</x>
                                                        <y>63</y>
                                                        <width>5</width>
                                                        <height>5</height>
                                                      </node.InputNode>
                                                      <node.InputNode reference="../../.."/>
                                                    </connections>
                                                    <border>
                                                      <red>255</red>
                                                      <green>0</green>
                                                      <blue>255</blue>
                                                      <alpha>255</alpha>
                                                    </border>
                                                    <signal reference="../parent/signal"/>
                                                    <x>25</x>
                                                    <y>8</y>
                                                    <width>5</width>
                                                    <height>5</height>
                                                  </from>
                                                  <parent class="nand" reference="../../.."/>
                                                  <connections/>
                                                  <border reference="../../../../../../../../inputs/node.InputNode[2]/border"/>
                                                  <signal reference="../from/parent/signal"/>
                                                  <x>201</x>
                                                  <y>134</y>
                                                  <width>5</width>
                                                  <height>5</height>
                                                </node.InputNode>
                                                <node.InputNode reference="../../.."/>
                                              </inputs>
                                              <outputs>
                                                <node.OutputNode>
                                                  <id>0</id>
                                                  <connected>false</connected>
                                                  <parent class="nand" reference="../../.."/>
                                                  <connections>
                                                    <node.InputNode>
                                                      <id>1</id>
                                                      <connected>true</connected>
                                                      <from class="node.OutputNode" reference="../../.."/>
                                                      <parent class="nand" reference="../../../../../../../../../../../../../../../../../../../../../../../.."/>
                                                      <connections/>
                                                      <border reference="../../../../../../../../../../inputs/node.InputNode[2]/border"/>
                                                      <signal>
                                                        <signal>true</signal>
                                                      </signal>
                                                      <x>311</x>
                                                      <y>142</y>
                                                      <width>5</width>
                                                      <height>5</height>
                                                    </node.InputNode>
                                                  </connections>
                                                  <border>
                                                    <red>255</red>
                                                    <green>0</green>
                                                    <blue>255</blue>
                                                    <alpha>255</alpha>
                                                  </border>
                                                  <signal reference="../connections/node.InputNode/signal"/>
                                                  <x>236</x>
                                                  <y>142</y>
                                                  <width>5</width>
                                                  <height>5</height>
                                                </node.OutputNode>
                                              </outputs>
                                              <inputCount>2</inputCount>
                                              <outputCount>1</outputCount>
                                              <canMove>false</canMove>
                                              <x1>-7</x1>
                                              <y1>-10</y1>
                                              <x2>211</x2>
                                              <y2>134</y2>
                                              <border reference="../../../../../../inputs/node.InputNode[2]/border"/>
                                              <signal reference="../outputs/node.OutputNode/connections/node.InputNode/signal"/>
                                              <circuit reference="../../../../../../../../../../../../../../../../../../../../../.."/>
                                              <x>211</x>
                                              <y>134</y>
                                              <width>20</width>
                                              <height>20</height>
                                            </parent>
                                            <connections/>
                                            <border reference="../../../../../inputs/node.InputNode[2]/border"/>
                                            <signal>
                                              <signal>true</signal>
                                            </signal>
                                            <x>201</x>
                                            <y>144</y>
                                            <width>5</width>
                                            <height>5</height>
                                          </node.InputNode>
                                        </connections>
                                        <border reference="../connections/node.InputNode/parent/outputs/node.OutputNode/border"/>
                                        <signal reference="../connections/node.InputNode/signal"/>
                                        <x>144</x>
                                        <y>140</y>
                                        <width>5</width>
                                        <height>5</height>
                                      </node.OutputNode>
                                    </outputs>
                                    <inputCount>2</inputCount>
                                    <outputCount>1</outputCount>
                                    <canMove>true</canMove>
                                    <x1>-7</x1>
                                    <y1>-7</y1>
                                    <x2>119</x2>
                                    <y2>132</y2>
                                    <border reference="../inputs/node.InputNode[2]/border"/>
                                    <signal reference="../outputs/node.OutputNode/connections/node.InputNode/signal"/>
                                    <circuit reference="../../../../../../../../../../../../../../../../.."/>
                                    <x>119</x>
                                    <y>132</y>
                                    <width>20</width>
                                    <height>20</height>
                                  </parent>
                                  <connections/>
                                  <border reference="../parent/inputs/node.InputNode[2]/border"/>
                                  <signal reference="../../../parent/signal"/>
                                  <x>109</x>
                                  <y>132</y>
                                  <width>5</width>
                                  <height>5</height>
                                </node.InputNode>
                                <node.InputNode reference="../node.InputNode[2]/parent/inputs/node.InputNode[2]"/>
                              </connections>
                              <border reference="../connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/inputs/node.InputNode/from/border"/>
                              <signal reference="../parent/signal"/>
                              <x>25</x>
                              <y>8</y>
                              <width>5</width>
                              <height>5</height>
                            </from>
                            <parent class="nand" reference="../../.."/>
                            <connections/>
                            <border reference="../from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]/border"/>
                            <signal reference="../from/parent/signal"/>
                            <x>198</x>
                            <y>53</y>
                            <width>5</width>
                            <height>5</height>
                          </node.InputNode>
                          <node.InputNode reference="../node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/inputs/node.InputNode/from/connections/node.InputNode"/>
                        </inputs>
                        <outputs>
                          <node.OutputNode reference="../../.."/>
                        </outputs>
                        <inputCount>2</inputCount>
                        <outputCount>1</outputCount>
                        <canMove>false</canMove>
                        <x1>-9</x1>
                        <y1>-5</y1>
                        <x2>208</x2>
                        <y2>53</y2>
                        <border reference="../inputs/node.InputNode/from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]/border"/>
                        <signal>
                          <signal>true</signal>
                        </signal>
                        <circuit reference="../../../../../../../../../../.."/>
                        <x>208</x>
                        <y>53</y>
                        <width>20</width>
                        <height>20</height>
                      </parent>
                      <connections>
                        <node.InputNode reference="../../.."/>
                      </connections>
                      <border reference="../parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/outputs/node.OutputNode/border"/>
                      <signal reference="../parent/signal"/>
                      <x>233</x>
                      <y>61</y>
                      <width>5</width>
                      <height>5</height>
                    </from>
                    <parent class="nand" reference="../../.."/>
                    <connections/>
                    <border reference="../from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]/border"/>
                    <signal reference="../from/parent/signal"/>
                    <x>302</x>
                    <y>57</y>
                    <width>5</width>
                    <height>5</height>
                  </node.InputNode>
                  <node.InputNode>
                    <id>1</id>
                    <connected>true</connected>
                    <from class="node.OutputNode">
                      <id>0</id>
                      <connected>false</connected>
                      <parent class="nand" reference="../../../../../../../.."/>
                      <connections>
                        <node.InputNode>
                          <id>0</id>
                          <connected>true</connected>
                          <from class="node.OutputNode" reference="../../.."/>
                          <parent class="gates.LED">
                            <MAX__INPUTS>1</MAX__INPUTS>
                            <MAX__OUTPUTS>0</MAX__OUTPUTS>
                            <MIN__INPUTS>1</MIN__INPUTS>
                            <MIN__OUTPUTS>0</MIN__OUTPUTS>
                            <label>~Q</label>
                            <fnt>
                              <attributes>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry/java.awt.font.TextAttribute"/>
                                  <float>1.0</float>
                                </entry>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry[2]/java.awt.font.TextAttribute"/>
                                  <int>0</int>
                                </entry>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry[3]/java.awt.font.TextAttribute"/>
                                  <float>0.0</float>
                                </entry>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry[4]/java.awt.font.TextAttribute"/>
                                  <string>Courier</string>
                                </entry>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry[5]/java.awt.font.TextAttribute"/>
                                  <float>10.0</float>
                                </entry>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry[6]/java.awt.font.TextAttribute"/>
                                  <float>1.0</float>
                                </entry>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry[7]/java.awt.font.TextAttribute"/>
                                  <java.awt.font.TransformAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry[7]/java.awt.font.TransformAttribute"/>
                                </entry>
                              </attributes>
                            </fnt>
                            <name>LED</name>
                            <id>9</id>
                            <inputs>
                              <node.InputNode reference="../../.."/>
                            </inputs>
                            <outputs/>
                            <inputCount>1</inputCount>
                            <outputCount>0</outputCount>
                            <canMove>true</canMove>
                            <x1>-7</x1>
                            <y1>-10</y1>
                            <x2>416</x2>
                            <y2>133</y2>
                            <border reference="../../../../../../node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]/border"/>
                            <signal>
                              <signal>false</signal>
                            </signal>
                            <circuit reference="../../../../../../../../../../../../.."/>
                            <x>416</x>
                            <y>133</y>
                            <width>20</width>
                            <height>20</height>
                          </parent>
                          <connections/>
                          <border reference="../../../../../node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]/border"/>
                          <signal reference="../parent/signal"/>
                          <x>406</x>
                          <y>141</y>
                          <width>5</width>
                          <height>5</height>
                        </node.InputNode>
                        <node.InputNode reference="../../.."/>
                        <node.InputNode>
                          <id>0</id>
                          <connected>true</connected>
                          <from class="node.OutputNode" reference="../../.."/>
                          <parent class="gates.ByPassGate">
                            <MAX__INPUTS>1</MAX__INPUTS>
                            <MAX__OUTPUTS>1</MAX__OUTPUTS>
                            <MIN__INPUTS>1</MIN__INPUTS>
                            <MIN__OUTPUTS>1</MIN__OUTPUTS>
                            <fnt>
                              <attributes>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry/java.awt.font.TextAttribute"/>
                                  <float>1.0</float>
                                </entry>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry[3]/java.awt.font.TextAttribute"/>
                                  <float>0.0</float>
                                </entry>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry[2]/java.awt.font.TextAttribute"/>
                                  <int>0</int>
                                </entry>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry[4]/java.awt.font.TextAttribute"/>
                                  <string>Courier</string>
                                </entry>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry[5]/java.awt.font.TextAttribute"/>
                                  <float>10.0</float>
                                </entry>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry[6]/java.awt.font.TextAttribute"/>
                                  <float>1.0</float>
                                </entry>
                                <entry>
                                  <java.awt.font.TextAttribute reference="../../../../../../../../../../../../../../fnt/attributes/entry[7]/java.awt.font.TextAttribute"/>
                                  <java.awt.font.TransformAttribute reference="../../../../../../../../../node.InputNode/from/parent/inputs/node.InputNode/from/parent/fnt/attributes/entry[7]/java.awt.font.TransformAttribute"/>
                                </entry>
                              </attributes>
                            </fnt>
                            <name>BYPASS</name>
                            <id>12</id>
                            <inputs>
                              <node.InputNode reference="../../.."/>
                            </inputs>
                            <outputs>
                              <node.OutputNode>
                                <id>1</id>
                                <connected>false</connected>
                                <parent class="module" reference="../../../../../../../../../../../../../../../.."/>
                                <connections/>
                                <border reference="../../../../../../../../node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/inputs/node.InputNode/from/border"/>
                                <signal>
                                  <signal>false</signal>
                                </signal>
                                <x>25</x>
                                <y>10</y>
                                <width>5</width>
                                <height>5</height>
                              </node.OutputNode>
                            </outputs>
                            <inputCount>1</inputCount>
                            <outputCount>1</outputCount>
                            <canMove>false</canMove>
                            <x1>0</x1>
                            <y1>0</y1>
                            <x2>0</x2>
                            <y2>0</y2>
                            <border reference="../../../../../../node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/border"/>
                            <signal reference="../outputs/node.OutputNode/signal"/>
                            <circuit reference="../../../../../../../../../../../../.."/>
                            <x>0</x>
                            <y>0</y>
                            <width>20</width>
                            <height>20</height>
                          </parent>
                          <connections/>
                          <border reference="../../../../../node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/border"/>
                          <signal reference="../../node.InputNode/parent/signal"/>
                          <x>-10</x>
                          <y>8</y>
                          <width>5</width>
                          <height>5</height>
                        </node.InputNode>
                      </connections>
                      <border reference="../../../node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/outputs/node.OutputNode/border"/>
                      <signal reference="../connections/node.InputNode/parent/signal"/>
                      <x>346</x>
                      <y>140</y>
                      <width>5</width>
                      <height>5</height>
                    </from>
                    <parent class="nand" reference="../../.."/>
                    <connections/>
                    <border>
                      <red>255</red>
                      <green>0</green>
                      <blue>0</blue>
                      <alpha>255</alpha>
                    </border>
                    <signal reference="../from/connections/node.InputNode/parent/signal"/>
                    <x>302</x>
                    <y>67</y>
                    <width>5</width>
                    <height>5</height>
                  </node.InputNode>
                </inputs>
                <outputs>
                  <node.OutputNode reference="../../.."/>
                </outputs>
                <inputCount>2</inputCount>
                <outputCount>1</outputCount>
                <canMove>false</canMove>
                <x1>-8</x1>
                <y1>-4</y1>
                <x2>312</x2>
                <y2>57</y2>
                <border reference="../inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]/border"/>
                <signal>
                  <signal>true</signal>
                </signal>
                <circuit reference="../../../../../../.."/>
                <x>312</x>
                <y>57</y>
                <width>20</width>
                <height>20</height>
              </parent>
              <connections>
                <node.InputNode>
                  <id>0</id>
                  <connected>true</connected>
                  <from class="node.OutputNode" reference="../../.."/>
                  <parent class="gates.LED">
                    <MAX__INPUTS>1</MAX__INPUTS>
                    <MAX__OUTPUTS>0</MAX__OUTPUTS>
                    <MIN__INPUTS>1</MIN__INPUTS>
                    <MIN__OUTPUTS>0</MIN__OUTPUTS>
                    <label>Q</label>
                    <fnt reference="../../../../parent/inputs/node.InputNode[2]/from/connections/node.InputNode/parent/fnt"/>
                    <name>LED</name>
                    <id>9</id>
                    <inputs>
                      <node.InputNode reference="../../.."/>
                    </inputs>
                    <outputs/>
                    <inputCount>1</inputCount>
                    <outputCount>0</outputCount>
                    <canMove>true</canMove>
                    <x1>-13</x1>
                    <y1>-6</y1>
                    <x2>0</x2>
                    <y2>0</y2>
                    <border reference="../../../../parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]/border"/>
                    <signal reference="../../../../parent/signal"/>
                    <circuit reference="../../../../../../../../.."/>
                    <x>412</x>
                    <y>56</y>
                    <width>20</width>
                    <height>20</height>
                  </parent>
                  <connections/>
                  <border reference="../../../parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]/border"/>
                  <signal reference="../../../parent/signal"/>
                  <x>402</x>
                  <y>64</y>
                  <width>5</width>
                  <height>5</height>
                </node.InputNode>
                <node.InputNode reference="../../.."/>
                <node.InputNode>
                  <id>0</id>
                  <connected>true</connected>
                  <from class="node.OutputNode" reference="../../.."/>
                  <parent class="gates.ByPassGate">
                    <MAX__INPUTS>1</MAX__INPUTS>
                    <MAX__OUTPUTS>1</MAX__OUTPUTS>
                    <MIN__INPUTS>1</MIN__INPUTS>
                    <MIN__OUTPUTS>1</MIN__OUTPUTS>
                    <fnt>
                      <attributes>
                        <entry>
                          <java.awt.font.TextAttribute reference="../../../../../../../../../../fnt/attributes/entry/java.awt.font.TextAttribute"/>
                          <float>1.0</float>
                        </entry>
                        <entry>
                          <java.awt.font.TextAttribute reference="../../../../../../../../../../fnt/attributes/entry[3]/java.awt.font.TextAttribute"/>
                          <float>0.0</float>
                        </entry>
                        <entry>
                          <java.awt.font.TextAttribute reference="../../../../../../../../../../fnt/attributes/entry[2]/java.awt.font.TextAttribute"/>
                          <int>0</int>
                        </entry>
                        <entry>
                          <java.awt.font.TextAttribute reference="../../../../../../../../../../fnt/attributes/entry[4]/java.awt.font.TextAttribute"/>
                          <string>Courier</string>
                        </entry>
                        <entry>
                          <java.awt.font.TextAttribute reference="../../../../../../../../../../fnt/attributes/entry[5]/java.awt.font.TextAttribute"/>
                          <float>10.0</float>
                        </entry>
                        <entry>
                          <java.awt.font.TextAttribute reference="../../../../../../../../../../fnt/attributes/entry[6]/java.awt.font.TextAttribute"/>
                          <float>1.0</float>
                        </entry>
                        <entry>
                          <java.awt.font.TextAttribute reference="../../../../../../../../../../fnt/attributes/entry[7]/java.awt.font.TextAttribute"/>
                          <java.awt.font.TransformAttribute reference="../../../../../../../parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/fnt/attributes/entry[7]/java.awt.font.TransformAttribute"/>
                        </entry>
                      </attributes>
                    </fnt>
                    <name>BYPASS</name>
                    <id>12</id>
                    <inputs>
                      <node.InputNode reference="../../.."/>
                    </inputs>
                    <outputs>
                      <node.OutputNode>
                        <id>0</id>
                        <connected>false</connected>
                        <parent class="module" reference="../../../../../../../../../../../.."/>
                        <connections/>
                        <border reference="../../../../../../parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/inputs/node.InputNode/from/border"/>
                        <signal>
                          <signal>true</signal>
                        </signal>
                        <x>25</x>
                        <y>0</y>
                        <width>5</width>
                        <height>5</height>
                      </node.OutputNode>
                    </outputs>
                    <inputCount>1</inputCount>
                    <outputCount>1</outputCount>
                    <canMove>false</canMove>
                    <x1>0</x1>
                    <y1>0</y1>
                    <x2>0</x2>
                    <y2>0</y2>
                    <border reference="../../../../parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/border"/>
                    <signal reference="../outputs/node.OutputNode/signal"/>
                    <circuit reference="../../../../../../../../.."/>
                    <x>0</x>
                    <y>0</y>
                    <width>20</width>
                    <height>20</height>
                  </parent>
                  <connections/>
                  <border reference="../../../parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/border"/>
                  <signal reference="../../../parent/signal"/>
                  <x>-10</x>
                  <y>8</y>
                  <width>5</width>
                  <height>5</height>
                </node.InputNode>
              </connections>
              <border reference="../parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/outputs/node.OutputNode/border"/>
              <signal reference="../parent/signal"/>
              <x>337</x>
              <y>65</y>
              <width>5</width>
              <height>5</height>
            </from>
            <parent class="nand" reference="../../.."/>
            <connections/>
            <border reference="../from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]/border"/>
            <signal reference="../from/parent/signal"/>
            <x>311</x>
            <y>132</y>
            <width>5</width>
            <height>5</height>
          </node.InputNode>
          <node.InputNode reference="../node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/outputs/node.OutputNode/connections/node.InputNode"/>
        </inputs>
        <outputs>
          <node.OutputNode reference="../../inputs/node.InputNode/from/parent/inputs/node.InputNode[2]/from"/>
        </outputs>
        <inputCount>2</inputCount>
        <outputCount>1</outputCount>
        <canMove>false</canMove>
        <x1>-8</x1>
        <y1>-9</y1>
        <x2>321</x2>
        <y2>132</y2>
        <border reference="../inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]/border"/>
        <signal reference="../inputs/node.InputNode/from/parent/inputs/node.InputNode[2]/from/connections/node.InputNode/parent/signal"/>
        <circuit reference="../../.."/>
        <x>321</x>
        <y>132</y>
        <width>20</width>
        <height>20</height>
      </nand>
      <nand reference="../nand/inputs/node.InputNode/from/parent"/>
      <nand reference="../nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent"/>
      <nand reference="../nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent"/>
      <nand reference="../nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent"/>
      <gates.ByPassGate reference="../nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent"/>
      <gates.ByPassGate reference="../nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/inputs/node.InputNode/from/parent"/>
      <gates.ByPassGate reference="../nand/inputs/node.InputNode/from/connections/node.InputNode[3]/parent"/>
      <gates.ByPassGate reference="../nand/inputs/node.InputNode/from/parent/inputs/node.InputNode[2]/from/connections/node.InputNode[3]/parent"/>
    </components>
    <MAX__INPUTS>16</MAX__INPUTS>
    <MAX__OUTPUTS>16</MAX__OUTPUTS>
    <MIN__INPUTS>0</MIN__INPUTS>
    <MIN__OUTPUTS>0</MIN__OUTPUTS>
    <label>D-FF</label>
    <fnt reference="../components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode[2]/from/connections/node.InputNode/parent/fnt"/>
    <name>CIRCUIT</name>
    <id>1109993458020</id>
    <inputs>
      <gates.DC>
        <MAX__INPUTS>0</MAX__INPUTS>
        <MAX__OUTPUTS>1</MAX__OUTPUTS>
        <MIN__INPUTS>0</MIN__INPUTS>
        <MIN__OUTPUTS>1</MIN__OUTPUTS>
        <label>D</label>
        <fnt reference="../../../components/nand/fnt"/>
        <name>DC</name>
        <id>7</id>
        <inputs/>
        <outputs>
          <node.OutputNode>
            <id>0</id>
            <connected>false</connected>
            <parent class="gates.DC" reference="../../.."/>
            <connections>
              <node.InputNode reference="../../../../../../components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode"/>
              <node.InputNode reference="../../../../../../components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]"/>
              <node.InputNode reference="../../../../../../components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]"/>
            </connections>
            <border reference="../../../../../components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/outputs/node.OutputNode/border"/>
            <signal>
              <signal>true</signal>
            </signal>
            <x>80</x>
            <y>53</y>
            <width>5</width>
            <height>5</height>
          </node.OutputNode>
        </outputs>
        <inputCount>0</inputCount>
        <outputCount>1</outputCount>
        <canMove>true</canMove>
        <x1>-8</x1>
        <y1>-8</y1>
        <x2>55</x2>
        <y2>45</y2>
        <border reference="../../../components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]/border"/>
        <signal reference="../outputs/node.OutputNode/signal"/>
        <circuit reference="../../.."/>
        <x>55</x>
        <y>45</y>
        <width>20</width>
        <height>20</height>
      </gates.DC>
      <gates.ToggleSwitch>
        <MAX__INPUTS>0</MAX__INPUTS>
        <MAX__OUTPUTS>1</MAX__OUTPUTS>
        <MIN__INPUTS>0</MIN__INPUTS>
        <MIN__OUTPUTS>1</MIN__OUTPUTS>
        <label>Clock</label>
        <fnt reference="../../../components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode[2]/from/connections/node.InputNode/parent/fnt"/>
        <name>DC</name>
        <id>7</id>
        <inputs/>
        <outputs>
          <node.OutputNode>
            <id>0</id>
            <connected>false</connected>
            <parent class="gates.ToggleSwitch" reference="../../.."/>
            <connections>
              <node.InputNode reference="../../../../../../components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/inputs/node.InputNode/from/connections/node.InputNode"/>
              <node.InputNode reference="../../../../../../components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/inputs/node.InputNode"/>
            </connections>
            <border reference="../../../../../components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/outputs/node.OutputNode/border"/>
            <signal>
              <signal>true</signal>
            </signal>
            <x>177</x>
            <y>106</y>
            <width>5</width>
            <height>5</height>
          </node.OutputNode>
        </outputs>
        <inputCount>0</inputCount>
        <outputCount>1</outputCount>
        <canMove>false</canMove>
        <x1>-12</x1>
        <y1>-11</y1>
        <x2>152</x2>
        <y2>98</y2>
        <border reference="../../../components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]/border"/>
        <signal reference="../outputs/node.OutputNode/signal"/>
        <circuit reference="../../.."/>
        <x>152</x>
        <y>98</y>
        <width>20</width>
        <height>20</height>
      </gates.ToggleSwitch>
    </inputs>
    <outputs>
      <gates.LED reference="../../components/nand/inputs/node.InputNode/from/connections/node.InputNode/parent"/>
      <gates.LED reference="../../components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode[2]/from/connections/node.InputNode/parent"/>
    </outputs>
    <inputCount>0</inputCount>
    <outputCount>0</outputCount>
    <canMove>false</canMove>
    <x1>0</x1>
    <y1>0</y1>
    <x2>0</x2>
    <y2>0</y2>
    <border reference="../components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/inputs/node.InputNode[2]/border"/>
    <signal>
      <signal>false</signal>
    </signal>
    <x>0</x>
    <y>0</y>
    <width>20</width>
    <height>20</height>
  </cir>
  <reconstruct>false</reconstruct>
  <MAX__INPUTS>16</MAX__INPUTS>
  <MAX__OUTPUTS>16</MAX__OUTPUTS>
  <MIN__INPUTS>0</MIN__INPUTS>
  <MIN__OUTPUTS>0</MIN__OUTPUTS>
  <label>D-FF</label>
  <fnt>
    <attributes>
      <entry>
        <java.awt.font.TextAttribute reference="../../../../cir/components/nand/fnt/attributes/entry/java.awt.font.TextAttribute"/>
        <float>1.0</float>
      </entry>
      <entry>
        <java.awt.font.TextAttribute reference="../../../../cir/components/nand/fnt/attributes/entry[3]/java.awt.font.TextAttribute"/>
        <float>0.0</float>
      </entry>
      <entry>
        <java.awt.font.TextAttribute reference="../../../../cir/components/nand/fnt/attributes/entry[2]/java.awt.font.TextAttribute"/>
        <int>0</int>
      </entry>
      <entry>
        <java.awt.font.TextAttribute reference="../../../../cir/components/nand/fnt/attributes/entry[4]/java.awt.font.TextAttribute"/>
        <string>Courier</string>
      </entry>
      <entry>
        <java.awt.font.TextAttribute reference="../../../../cir/components/nand/fnt/attributes/entry[5]/java.awt.font.TextAttribute"/>
        <float>10.0</float>
      </entry>
      <entry>
        <java.awt.font.TextAttribute reference="../../../../cir/components/nand/fnt/attributes/entry[6]/java.awt.font.TextAttribute"/>
        <float>1.0</float>
      </entry>
      <entry>
        <java.awt.font.TextAttribute reference="../../../../cir/components/nand/fnt/attributes/entry[7]/java.awt.font.TextAttribute"/>
        <java.awt.font.TransformAttribute reference="../../../../cir/components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/fnt/attributes/entry[7]/java.awt.font.TransformAttribute"/>
      </entry>
    </attributes>
  </fnt>
  <name>Module</name>
  <id>1109994129161</id>
  <inputs>
    <node.InputNode reference="../../cir/components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode"/>
    <node.InputNode reference="../../cir/components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/connections/node.InputNode[2]/parent/outputs/node.OutputNode/connections/node.InputNode/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode"/>
  </inputs>
  <outputs>
    <node.OutputNode reference="../../cir/components/nand/inputs/node.InputNode/from/connections/node.InputNode[3]/parent/outputs/node.OutputNode"/>
    <node.OutputNode reference="../../cir/components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode[2]/from/connections/node.InputNode[3]/parent/outputs/node.OutputNode"/>
  </outputs>
  <inputCount>0</inputCount>
  <outputCount>0</outputCount>
  <canMove>false</canMove>
  <x1>0</x1>
  <y1>0</y1>
  <x2>0</x2>
  <y2>0</y2>
  <border reference="../cir/components/nand/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/from/parent/inputs/node.InputNode/border"/>
  <signal>
    <signal>false</signal>
  </signal>
  <x>0</x>
  <y>0</y>
  <width>20</width>
  <height>20</height>
</module>