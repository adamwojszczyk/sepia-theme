package plugin.style.scheme;

import plugin.domain.Palette;
import plugin.domain.color.Color;

import static java.util.Objects.requireNonNull;

public class Background {

	private final Palette palette;

	public Background(Palette palette) {
		this.palette = requireNonNull(palette);
	}

	public Color base() {
		return palette.sepia().brightest();
	}

	public Color selectedLine() {
		return base().darker(2);
	}

	public Color underCaret() {
		return selectedLine().darker(2);
	}

	public Color underCaretWrite() {
		return underCaret().darker();
	}

	public Color selectedText() {
		return palette.blue().brighter();
	}

	public Color documentation() {
		return base();
	}

	public Color readOnly() {
		return base().darker();
	}

	public Color hints() {
		return base().darker();
	}
}
