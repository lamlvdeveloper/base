package com.example.baseapp.model.entity;

import java.util.List;

public class Menu {
    private MenuLeft menus;

    public MenuLeft getMenus() {
        return menus;
    }

    public void setMenus(MenuLeft menus) {
        this.menus = menus;
    }

    public static class MenuLeft {
        private List<ItemMenu> left;

        public List<ItemMenu> getLeft() {
            return left;
        }

        public void setLeft(List<ItemMenu> left) {
            this.left = left;
        }

        public class ItemMenu {

            private String id;
            private String code;
            private String name;
            private String icon_url;
            private String link;
            private List<ItemMenu> children;
            private int position;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getIcon_url() {
                return icon_url;
            }

            public void setIcon_url(String icon_url) {
                this.icon_url = icon_url;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public List<ItemMenu> getChildren() {
                return children;
            }

            public void setChildren(List<ItemMenu> children) {
                this.children = children;
            }

            public int getPosition() {
                return position;
            }

            public void setPosition(int position) {
                this.position = position;
            }
        }
    }

}
