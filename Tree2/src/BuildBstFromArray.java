public class BuildBstFromArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4};

		int l = 0;

		int r = a.length - 1;

		Tree res = buildBst(a, l, r);

		System.out.println(res);

	}

	private static Tree buildBst(int[] a, int l, int r) {

		Tree t = null;

		if (l > r) {

			return null;

		}

		int mid = (l + r) / 2;

		t = new Tree(a[mid]);

		t.setLeft(buildBst(a, l, mid - 1));

		t.setRight(buildBst(a, mid + 1, r));

		return t;
	}

}
