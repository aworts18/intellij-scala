package org.jetbrains.plugins.scala.annotator.intention.sbt.ui

import java.awt.Dimension
import javax.swing.{Icon, JComponent}

import com.intellij.ide.wizard.Step
import org.jetbrains.sbt.resolvers.ArtifactInfo

/**
  * Created by afonichkin on 7/19/17.
  */
class SbtArtifactChooseDependencyStep(wizard: SbtArtifactSearchWizard, artifactInfoSet: Set[ArtifactInfo])
  extends SbtArtifactSearchPanel(wizard, artifactInfoSet) with Step {

  override def _init(): Unit = {
    wizard.setTitle("Sbt Artifact Search")
    setPreferredSize(new Dimension(1600, 1200))
    updateUI()
  }

  override def getIcon: Icon = null

  override def _commit(finishChosen: Boolean): Unit = {
    wizard.resultArtifact = getResult
  }

  override def getPreferredFocusedComponent: JComponent = this

  override def getComponent: JComponent = this
}
