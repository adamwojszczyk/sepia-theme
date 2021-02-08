package plugin.style;

import plugin.domain.Color;

import static java.util.Objects.requireNonNull;

public class Tab {

	private final Style style;

	public Tab(Style style) {
		this.style = requireNonNull(style);
	}

	public Color selected() {
		return style.ui().background().base();
	}

	public Color hover() {
		return selected();
	}

	public Color inBackground() {
		return selected().darker(3);
	}

	public Color inBackgroundInactive() {
		return inBackground().brighter();
	}

	public Color borderColor() {
		return selected();
	}

	public Color underline() {
		return style.editor().background().selectedText();
	}

	public Integer editorUnderlineHeight() {
		return 2;
	}

	public Integer settingsUnderlineHeight() {
		return 3;
	}
}
